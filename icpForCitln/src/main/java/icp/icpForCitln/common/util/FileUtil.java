/**
 * Project Name: icpForCitln
 * File Name: FileUtil
 * Package Name: icp.icpForCitln.common.util
 * Date: 19/04/17 16:23
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.common.util;

import com.mongodb.client.gridfs.model.GridFSFile;
import icp.icpForCitln.IcpForCitlnApplication;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.Base64Utils;

import javax.annotation.PostConstruct;
import java.io.InputStream;

@Component
public class FileUtil {
    private final static Logger logger = LoggerFactory.getLogger(IcpForCitlnApplication.class);

    @Autowired
    private GridFsTemplate gridFsTemplate;

    private static FileUtil fileUtil;


    /**
     * @author: guoxs
     * @date: 19/04/18 09:23
     * @since: JDK 1.8
     *
     * @description: 初始化 GridFsTemplate
     * @param: []
     * @return: void
     */
    @PostConstruct
    public void init() {
        fileUtil = this;
        fileUtil.gridFsTemplate = this.gridFsTemplate;
    }

    /**
     * @author: guoxs
     * @date: 19/04/18 09:21
     * @since: JDK 1.8
     *
     * @description: 文件上传方法 返回文件id
     * @param: [inputStream, fileName]
     * @return: java.lang.String
     */
    public  static String fileUpload(InputStream file){
        if (file == null){
            logger.info("获取不到文件");
            return "获取不到文件";
        }
        try {
            Object id = fileUtil.gridFsTemplate.store(file, GeneratedCodeUtil.generatedCode());
            return id.toString();
        }catch (Exception e){
            logger.error("文件上传失败");
            return null;
        }
    }

    /**
     * @author: guoxs
     * @date: 19/04/18 09:22
     * @since: JDK 1.8
     *
     * @description: 通过id获取文件
     * @param: [id]
     * @return: java.io.InputStream
     */
    public static String fileDownload(String id){
        Query query = new Query(Criteria.where("_id").is(id));
        GridFSFile file;
        GridFsResource resource;
        try {
             file = fileUtil.gridFsTemplate.findOne(query);
            resource = fileUtil.gridFsTemplate.getResource(file);
            byte[] fu = IOUtils.toByteArray(resource.getInputStream());
            return Base64Utils.encodeToString(fu);
        }catch (Exception e){
            logger.error("文件"+id+"不存在");
            return null;
        }
//        try {
//            resource = fileUtil.gridFsTemplate.getResource(file);
//            return resource;
//        }catch (Exception e){
//            logger.error("获取文件"+id+"失败");
//            return null;
//        }
    }

    /**
     * @author: guoxs
     * @date: 19/04/18 09:23
     * @since: JDK 1.8
     *
     * @description: 通过id删除文件 删除成功返回true 失败返回false
     * @param: [id]
     * @return: boolean
     */
    public static boolean fileDelete(String id){
        Query query = new Query(Criteria.where("_id").is(id));
        try {
            fileUtil.gridFsTemplate.delete(query);
            return true;
        }catch (Exception e){
            logger.info("文件"+id+"不存在");
            return false;
        }

    }
}
