/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Servlet Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloWorld
*/

package com.example.gsipic.myapplication.backend;

import com.example.Jokes;

import org.json.JSONObject;

import java.io.IOException;

import javax.servlet.http.*;

import jdk.nashorn.api.scripting.JSObject;

public class MyServlet extends HttpServlet {


    public static final String JOKE_TAG = "joke";

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        resp.setContentType("application/json");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put(JOKE_TAG, Jokes.getJoke());

        resp.getWriter().println(jsonObject.toString());
    }
}
