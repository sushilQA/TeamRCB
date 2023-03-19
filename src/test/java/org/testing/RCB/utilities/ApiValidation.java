package org.testing.RCB.utilities;

import org.json.JSONObject;

import io.restassured.response.Response;

public class ApiValidation {

	public void apiValidation(Response response) {

		if (response.statusCode() >= 200 & response.statusCode() < 300) {
			JSONObject jsonObject = new JSONObject(response.asPrettyString());
			int npfCode = Integer.parseInt(jsonObject.get("code").toString());
			if (npfCode >= 1000 & npfCode <= 9000 || !jsonObject.get("message").toString().contains("successfully")) {
				System.out.println("\n" + response.asPrettyString());
			} else {
				System.out.println("And the response is given below :\n\n" + response.asPrettyString());

			}
		} else if (response.statusCode() >= 300 & response.statusCode() < 512) {
			System.out.println("\nAnd the response is given below :\n" + response.asPrettyString());
		} else {
			System.out.println("\nAnd the response is given below :\n" + response.asPrettyString());
		}

	}

}
