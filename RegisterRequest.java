package com.example.moron_000.cards20;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "http://cards.net16.net/Register.php";

    private Map<String, String> params;

    public RegisterRequest(String username, String name, int age, String password, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);

        params = new HashMap<>();

        params.put("username", username);
        params.put("name", name);
        params.put("password", password);
        params.put("age", age + "");
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
