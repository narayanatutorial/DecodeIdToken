package com.narayanatutorial.DecodeIdToken;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;

public class DecodeIdToken {
	public static void main(String[] args) {
		//Give your Id Token to decrypt
		String id_token = "eyJ0eXAiOiJKV1QiLCJraWQiOiJ3VTNpZklJYUxPVUFSZVJCL0ZHNmVNMVAxUU09IiwiYWxnIjoiUlMyNTYifQ.eyJhdF9oYXNoIjoiOHNhdF9DdFJMM0FvUWFIZmM2RWdzZyIsInN1YiI6ImRlbW8iLCJhdWRpdFRyYWNraW5nSWQiOiJmMzczZjFlMC0xOTM0LTQxZGYtYmMwMy1kOWJmOGVmZDJkMmMtODE2Mjg3IiwiaXNzIjoiaHR0cDovL29wZW5hbS5uYXJheWFuYXR1dG9yaWFsLmNvbTo4OTkxL2FtL29hdXRoMiIsInRva2VuTmFtZSI6ImlkX3Rva2VuIiwiYXVkIjoibXlDbGllbnQiLCJjX2hhc2giOiJIamlnd0pxVzRNNjhSbE9OenZhQUtnIiwiYWNyIjoiMCIsIm9yZy5mb3JnZXJvY2sub3BlbmlkY29ubmVjdC5vcHMiOiJYajYyNnNFdmdzczQwdnQ3X3J3cEZmLXZzMmMiLCJzX2hhc2giOiJ1bmdXdjQ4QnotcEJRVURlWGE0aUl3IiwiYXpwIjoibXlDbGllbnQiLCJhdXRoX3RpbWUiOjE1ODYyMzM0MDUsInJlYWxtIjoiLyIsImV4cCI6MTU4NjIzNzA0NiwidG9rZW5UeXBlIjoiSldUVG9rZW4iLCJpYXQiOjE1ODYyMzM0NDZ9.cOksurVzCToTmyMjsLVIEjG2NB1nemtZCH5HtQ66SRB-a0EZahad7ZnD4P1P6_k1JDJDCJukEmYuWw1uxh0yOU_HV7tguNVUGD4XkbImuDUTGkO3-PGczNXREWw4SNbQ-JutKwBuYDMslpLUgKmzt2afGnjvGuwRMcZ5IQKx5Ul_Dw_bLGRIUy_spL6fSDb9zsSv2wLaf3Jz_IuaD8ORY3lqeTusRtqM6L3WoUqR7srH8kpz30xuopu-l5t1rhd7wgVvH9AJtxHsiMVLLOAML2Slm7bzi0t24s0Jiv74vdKqTXIqNIYoqUDhUa212U4hP0QgMTiHYV5_oNyEo_KzkQ";
		
		//decrypt id_token
		DecodedJWT jwt = JWT.decode(id_token);
		
		String iss=jwt.getClaim("iss").asString();
		String sub = jwt.getClaim("sub").asString();
		String aud=jwt.getClaim("aud").asString();
		Long ext=jwt.getClaim("ext").asLong();
		Long iat=jwt.getClaim("iat").asLong();
		String nonce=jwt.getClaim("nonce").asString();
		String name=jwt.getClaim("name").asString();
		String picture=jwt.getClaim("picture").asString();
		String tokenName=jwt.getClaim("tokenName").asString();
		String realm=jwt.getClaim("realm").asString();
		String tokenType=jwt.getClaim("tokenType").asString();
		Long exp=jwt.getClaim("exp").asLong();
		Long auth_time=jwt.getClaim("auth_time").asLong();
		String auditTrackingId=jwt.getClaim("auditTrackingId").asString();
		
		System.out.println("iss: \t" + iss);
		System.out.println("sub: \t" + sub);
		System.out.println("aud: \t" + aud);
		System.out.println("ext: \t" + ext);
		System.out.println("iat: \t" + iat);
		System.out.println("nonce: \t" + nonce);
		System.out.println("name: \t" + name);
		System.out.println("picture: \t" + picture);
		System.out.println("tokenName: \t" + tokenName);
		System.out.println("realm: \t" + realm);
		System.out.println("tokenType: \t" + tokenType);
		System.out.println("exp: \t" + exp);
		System.out.println("auth_time: \t" + auth_time);
		System.out.println("auditTrackingId: \t" + auditTrackingId);
	}
}
