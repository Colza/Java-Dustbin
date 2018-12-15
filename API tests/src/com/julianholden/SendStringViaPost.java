// Not tested

//https://www.javacodegeeks.com/2012/09/simple-rest-client-in-java.html


package com.julianholden;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class SendStringViaPost {


        public static void main(String[] args) throws ClientProtocolException, IOException {
            HttpClient client = new DefaultHttpClient();
            HttpPost post = new HttpPost('http://restUrl');
            StringEntity input = new StringEntity('product');
            post.setEntity(input);
            HttpResponse response = client.execute(post);
            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String line = '';
            while ((line = rd.readLine()) != null) {
                System.out.println(line);
            }
        }
    }