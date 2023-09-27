package com.exam;

import java.util.Arrays;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class InsertTest {
	
	public static void main(String[] args) {
		
		// Mongo DB 연동
		MongoClient client = MongoClients.create("mongodb://localhost:27017");
		
		// 특정 DB 연동 (tutorial)
		MongoDatabase db = client.getDatabase("tutorial");
		
		// 컬렉션 연동 (user)
		MongoCollection<Document> collection = db.getCollection("user");
		
		// 저장 (insert)
		// 단일 문서 저장 : db.user.insertOne()
		Document d1 = new Document();
		d1.append("_id", 8);
		d1.append("username", "춘식이");
		d1.append("age", 10);
		d1.append("gender", "m");
//		collection.insertOne(d1);
		
		// 다중 문서 저장 : db.user.insertMany()
		Document d2 = new Document();
		d2.append("username", "라이언");
		d2.append("age", 15);
		d2.append("gender", "m");
		Document d3 = new Document();
		d3.append("username", "죠르디");
		d3.append("age", 5);
		d3.append("gender", "f");
		List<Document> list = Arrays.asList(d2, d3);
		collection.insertMany(list);
		
		// 전체 조회
		MongoCursor<Document> cursor = collection.find().cursor();
		
		while (cursor.hasNext()) {
			Document doc = cursor.next();
			System.out.println(doc);
			System.out.println(doc.get("_id")+" "+doc.get("username"));
		}
		
	}
	
}
