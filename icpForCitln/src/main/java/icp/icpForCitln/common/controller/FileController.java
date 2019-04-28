/**
 * Project Name: icpForCitln
 * File Name: FileController
 * Package Name: icp.icpForCitln.common.controller
 * Date: 19/04/28 15:27
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.common.controller;

import icp.icpForCitln.common.util.FileUtil;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/file")
public class FileController {

    /**
     * @author: guoxs
     * @date: 19/04/28 15:43
     * @since: JDK 1.8
     *
     * @description: 文件上传
     * @param: [bfile]
     * @return: java.util.List<java.lang.String>
     */
    @PostMapping("/upload")
    public List<String> fileUpload(HttpServletRequest bfile) {
        List<String> ids = new ArrayList<>();
        MultipartHttpServletRequest request = (MultipartHttpServletRequest) bfile;
        MultiValueMap<String, MultipartFile> map = request.getMultiFileMap();
        for (Map.Entry<String, List<MultipartFile>> entry : map.entrySet()) {
            List<MultipartFile> list = entry.getValue();
            for (MultipartFile multipartFile : list) {
                try {
                    String id = FileUtil.fileUpload(multipartFile.getInputStream());
                    ids.add(id);
                } catch (Exception ex) {
                    return null;
                }
            }
        }

        return ids;
    }

    /**
     * @author: guoxs
     * @date: 19/04/28 15:43
     * @since: JDK 1.8
     *
     * @description: 文件获取
     * @param: [id]
     * @return: java.lang.String
     */
    @GetMapping(value = "/get")
    public String fileGet(String id){
        if (id==null){
            return "获取不到文件ID";
        }
        String file = FileUtil.fileDownload(id);

        if (file!=null){
            return file;
        }else {
            return "获取文件失败！";
        }
    }

}
