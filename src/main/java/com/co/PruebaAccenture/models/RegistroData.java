package com.co.PruebaAccenture.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class RegistroData {
    public static List<RegistroData> setData(DataTable dataTable) {
        List<RegistroData> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, RegistroData.class));
        }
        return dates;
    }

    String Usuario;
    String Clave;

}
