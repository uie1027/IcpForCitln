/**
 * Project Name: icpForCitln
 * File Name: FileUtilTest
 * Package Name: icp.icpForCitln
 * Date: 19/04/17 16:42
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln;

import icp.icpForCitln.common.util.FileUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.misc.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileUtilTest {

    @Test
    public void fileUploadTest() throws Exception{
        File file = new File("C:\\Users\\sr\\Desktop\\apr-1.4.8-3.el7_4.1.x86_64.rpm");
        InputStream inputStream = new FileInputStream(file);
        String id = FileUtil.fileUpload(inputStream,"apr-1.4.8-3.el7_4.1.x86_64.rpm");

        System.out.println(id);
    }

    @Test
    public void fileDownload(){
        InputStream inputStream = FileUtil.fileDownload("5cb6f0e1295189259cc2a368");
        System.out.println(inputStream.toString());
    }
    @Test
    public void fileDetele(){
        if (FileUtil.fileDelete("5cb6f0e1295189259cc2a368")){
            System.out.println("success");
        }
    }
}
