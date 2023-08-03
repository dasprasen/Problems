package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Prasenjit Kumar Das
 */
public class Demo {
    public static void main(String[] args) {
        String s ="HTTP/1.1 404\r\nAccess-Control-Allow-Origin: *\r\nAccess-Control-Allow-Methods: " +
                "POST, GET, PUT, OPTIONS, DELETE\r\nAccess-Control-Max-Age: 3600\r\nAccess-Control-" +
                "Allow-Headers: Origin, X-Requested-With, Content-Type, Accept\r\nCerner-Correlation-Id: " +
                "00a20324-244f-49a7-9f80-5fa96ef3e4b4\r\nContent-Type: application/vnd.cerner.organization-" +
                "1.0+json\r\nTransfer-Encoding: chunked\r\nDate: Tue, 13 Mar 2018 19:55:21 GMT\r\n" +
                "Server: _\r\n\r\n<!doctype html><html lang=\"en\"><head><title>HTTP Status 404 ? Not Found</title>" +
                "<style type=\"text/css\">h1 {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;" +
                "font-size:22px;} h2 {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;font-size:16px;} " +
                "h3 {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;font-size:14px;} body " +
                "{font-family:Tahoma,Arial,sans-serif;color:black;background-color:white;} b {font-family:Tahoma,Arial," +
                "sans-serif;color:white;background-color:#525D76;} p {font-family:Tahoma,Arial,sans-serif;background:white;" +
                "color:black;font-size:12px;} a {color:black;} a.name {color:black;} .line {height:1px;background-color:#525D76;" +
                "border:none;}</style></head><body><h1>HTTP Status 404 ? Not Found</h1><hr class=\"line\" /><p><b>Type</b> " +
                "Status Report</p><p><b>Message</b> Not Found</p><p><b>Description</b> The origin server did not find " +
                "a current representation for the target resource or is not willing to disclose that one exists.</p><hr clas ...\n";

        String res = "";

        int last = s.indexOf("\r\n\r\n");
        if(last >= 0) {
            res = s.substring(last + 4);
        } else {
            res = "No Message";
        }

        String pattern = "<body[^>]*>.*?<h1[^>]*>(.*?)</h1>";
        String h1Text = "";
        Pattern r = Pattern.compile(pattern, Pattern.DOTALL);
        Matcher m = r.matcher(res);
        if (m.find()) {
            h1Text = m.group(1);
        }
        System.out.println(h1Text);
    }
}
