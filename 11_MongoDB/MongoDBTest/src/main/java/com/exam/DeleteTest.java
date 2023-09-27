package com.exam;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class DeleteTest {
	
	public static void main(String[] args) {
		
		// Mongo DB 연동
		MongoClient client = MongoClients.create("mongodb://localhost:27017");
		
		// 특정 DB 연동 (tutorial)
		MongoDatabase db = client.getDatabase("tutorial");
		
		// 컬렉션 연동 (user)
		MongoCollection<Document> collection = db.getCollection("user");
		
		// 삭제 (delete)
		// 단일 문서 삭제 : db.user.deleteOne({username:'죠르디'})
		collection.deleteOne(Filters.eq("username", "죠르디"));
		
		// 다중 문서 삭제 : db.user.deleteMany({age:{$lte:15}})
		collection.deleteMany(Filters.lte("age", 15));		
		
		// 전체 조회
		MongoCursor<Document> cursor = collection.find().cursor();
		
		while (cursor.hasNext()) {
			Document doc = cursor.next();
			System.out.println(doc);
			System.out.println(doc.get("_id")+" "+doc.get("username"));
		}
		
	}
	
}
