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

public class UpdateTest {
	
	public static void main(String[] args) {
		
		// Mongo DB 연동
		MongoClient client = MongoClients.create("mongodb://localhost:27017");
		
		// 특정 DB 연동 (tutorial)
		MongoDatabase db = client.getDatabase("tutorial");
		
		// 컬렉션 연동 (user)
		MongoCollection<Document> collection = db.getCollection("user");
		
		// 수정 (update)
		// 단일 문서 수정 : db.user.updateOne({username:'정조'}, {$set:{age:50}})
		Bson filter = Filters.eq("username", "정조");
		Bson update = Updates.set("age", 50);
//		collection.updateOne(filter, update);
		// db.user.updateOne({username:'정조'}, {$set:{age:50, gender:'f'}})
		Bson filter2 = Filters.eq("username", "정조");
		Bson update2 = Updates.combine(Updates.set("age", 60), Updates.set("gender", "f"));
//		collection.updateOne(filter2, update2);
		
		// 다중 문서 수정 : db.user.updateMany({age:{$gt:40}}, {$set:{gender:'f'}})
		Bson filter3 = Filters.gt("age", 40);
		Bson update3 = Updates.set("gender", "m");
		collection.updateMany(filter3, update3);
		
		// 전체 조회
		MongoCursor<Document> cursor = collection.find().cursor();
		
		while (cursor.hasNext()) {
			Document doc = cursor.next();
			System.out.println(doc);
			System.out.println(doc.get("_id")+" "+doc.get("username"));
		}
		
	}
	
}
