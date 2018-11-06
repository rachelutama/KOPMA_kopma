/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;
import helper.BarangHelper;

import java.util.List;
import pojos.Barang;


/**
 *
 * @author basisa25
 */
public class TestTampilBarang {
    public static void main(String[] args) {
        BarangHelper test = new BarangHelper();
        List<Barang> list = test.getAllBarang();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json);
    }
}
