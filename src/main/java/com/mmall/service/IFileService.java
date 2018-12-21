package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;package com.mmall.service;

/**
 * @author logan
 * @create 2018-12-20 4:31 PM
 */

public interface IFileService {
    String upload(MultipartFile file, String path);
}
