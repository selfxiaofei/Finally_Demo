package com.atguigu;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author zhumengfei
 * @create --
 */
@RestController
@RequestMapping("/test")
public class testup {

    @PostMapping("up")
    public String testup(MultipartFile multipartFile, HttpSession httpSession) throws IOException {
        //获取上传的文件名
        String originalFilename = multipartFile.getOriginalFilename();
        //处理文件重名问题
        String hzName = originalFilename.substring(originalFilename.lastIndexOf("."));
        originalFilename = UUID.randomUUID().toString() + hzName;

        //获取服务器中的路径
        ServletContext servletContext = httpSession.getServletContext();
        String multipartFile1 = servletContext.getRealPath("multipartFile");
        File file = new File(multipartFile1);
        if(!file.exists()){
            file.mkdir();
        }
        String finalPath = multipartFile1 + File.separator + originalFilename;
        //实现上传功能
        multipartFile.transferTo(new File(finalPath));
        System.out.println("第二版本");
        return "successmm";

    }


}
