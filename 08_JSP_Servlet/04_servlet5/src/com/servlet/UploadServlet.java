package com.servlet;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/upload")
public class UploadServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 파일 업로드 기능 구현
		
		// Create a factory for disk-based file items
		DiskFileItemFactory factory = new DiskFileItemFactory();

		// Configure a repository (to ensure a secure temp location is used)
		ServletContext servletContext = this.getServletConfig().getServletContext();
		File repository = (File) servletContext.getAttribute("jakarta.servlet.context.tempdir"); // Or "javax.servlet.context.tempdir" for javax
		factory.setRepository(repository);

		// Create a new file upload handler // 버전이 맞지 않아 변경
//		JakartaServletDiskFileUpload upload = new JakartaServletDiskFileUpload(factory);
		ServletFileUpload upload = new ServletFileUpload(factory);

		// Parse the request
		try { // 버전이 맞지 않아 변경
//			List<DiskFileItem> items = upload.parseRequest(request);
			List<FileItem> items = upload.parseRequest(request);
			Iterator<FileItem> iter = items.iterator();
			// Process the uploaded items
			while (iter.hasNext()) {
				FileItem item = iter.next();
			    if (item.isFormField()) { // type="file"이 아닌 것을 처리
			        String name = item.getFieldName(); // tag의 name값
			        String value = item.getString("utf-8"); // 입력값 (한글처리)
			        System.out.println("text 데이터");
			        System.out.println("getFieldName : "+name);
			        System.out.println("getString : "+value);
			    } else { // type="file"인 것을 처리
			        String fieldName = item.getFieldName(); // tag의 name값
			        String fileName = item.getName(); // 업로드한 파일명
			        String contentType = item.getContentType(); // 파일 유형
			        boolean isInMemory = item.isInMemory();
			        long sizeInBytes = item.getSize(); // 파일 크기
			        System.out.println("file 데이터");
			        System.out.println("fieldName : "+fieldName);
			        System.out.println("fileName : "+fileName);
			        System.out.println("contentType : "+contentType);
			        System.out.println("isInMemory : "+isInMemory);
			        System.out.println("sizeInBytes : "+sizeInBytes);
			        
			        // 특정 경로에 파일 저장 : c:\\upload
			        File f = new File("c:\\upload", fileName);
			        try {
						item.write(f);
					} catch (Exception e) {
						e.printStackTrace();
					}
			        
			    }
			}
		} catch (FileUploadException e) {
			e.printStackTrace();
		}
	}

}
