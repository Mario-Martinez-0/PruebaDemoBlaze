package com.co.PruebaAccenture.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class InicioData {
    public static List<InicioData> setData(DataTable dataTable) {
        List<InicioData> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, InicioData.class));
        }
        return dates;
    }

    String Usuario;
    String Clave;
}
