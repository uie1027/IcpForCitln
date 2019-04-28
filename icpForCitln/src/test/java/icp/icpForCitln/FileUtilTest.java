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

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileUtilTest {

    @Test
    public void fileDetele(){
        if (FileUtil.fileDelete("5cb6f0e1295189259cc2a368")){
            System.out.println("success");
        }
    }
}
