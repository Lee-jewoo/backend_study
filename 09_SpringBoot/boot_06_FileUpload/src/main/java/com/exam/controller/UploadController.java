package com.exam.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.exam.dto.UploadDTO;

@Controller
public class UploadController {

	@GetMapping("/uploadForm")
	public String uploadForm() {
		return "uploadForm";
	}

	@PostMapping("/upload")
	public String upload(UploadDTO dto) {
		String theText = dto.getTheText();
		MultipartFile theFile = dto.getTheFile();
		
		// 파일 정보
		long size = theFile.getSize();
		String name = theFile.getName();
		String originalFileName = theFile.getOriginalFilename();
		String contentType = theFile.getContentType();
		System.out.println(theText);
		System.out.println(size);
		System.out.println(name);
		System.out.println(originalFileName);
		System.out.println(contentType);

		File f = new File("c:\\upload", originalFileName);
		try {
			theFile.transferTo(f);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "uploadForm";
	}

}
