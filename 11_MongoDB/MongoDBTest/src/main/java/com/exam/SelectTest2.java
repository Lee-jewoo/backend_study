package com.exam;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class SelectTest2 {
	
	public static void main(String[] args) {
		
		// Mongo DB 연동
		MongoClient client = MongoClients.create("mongodb://localhost:27017");
		
		// 특정 DB 연동 (tutorial)
		MongoDatabase db = client.getDatabase("tutorial");
		
		// 컬렉션 연동 (user)
		MongoCollection<Document> collection = db.getCollection("user");
		
		// 조건 지정 조회
		// db.user.find({gender:'f'})
		Bson filter = Filters.eq("gender", "f");
		
		// db.user.find({age:{$gt:50}})
		filter = Filters.gt("age", 50);
		
		// db.user.find({$and:[{gender:'f'}, {age:18}]})
		filter = Filters.and(Filters.eq("gender", "f"), Filters.eq("age", 18));
		
		// db.user.find({$or:[{gender:'f'}, {age:18}]})
		filter = Filters.or(Filters.eq("gender", "f"), Filters.eq("age", 18));
		
		MongoCursor<Document> cursor = collection.find(filter).cursor();
		while (cursor.hasNext()) {
			Document doc = cursor.next();
			System.out.println(doc);
			System.out.println(doc.get("_id")+" "+doc.get("username"));
		}
		
	}
	
}
