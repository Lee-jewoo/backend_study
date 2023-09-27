package com.exam;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class SelectTest {
	
	public static void main(String[] args) {
		
		// Mongo DB 연동
		MongoClient client = MongoClients.create("mongodb://localhost:27017");
		
		// 특정 DB 연동 (tutorial)
		MongoDatabase db = client.getDatabase("tutorial");
		
		// 컬렉션 연동 (user)
		MongoCollection<Document> collection = db.getCollection("user");
		
		// 전체 조회 : db.user.find()
		MongoCursor<Document> cursor = collection.find().cursor();
		
		while (cursor.hasNext()) {
			Document doc = cursor.next();
			System.out.println(doc);
			System.out.println(doc.get("_id")+" "+doc.get("username"));
		}
		
	}
	
}
