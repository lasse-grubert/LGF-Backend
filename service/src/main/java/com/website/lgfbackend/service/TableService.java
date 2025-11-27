package com.website.lgfbackend.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.website.lgfbackend.dto.RowDataDto;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class TableService {
    private final ObjectMapper mapper = new ObjectMapper();
    private final File file = new File(System.getProperty("user.dir") + "/table.json");

    public void saveData(List<RowDataDto> rows) {
        try {
            List<RowDataDto> existingRows = loadData();
            List<RowDataDto> combined = new ArrayList<>(existingRows);
            combined.addAll(rows);
            mapper.writeValue(file, combined);
        } catch (Exception e) {
            throw new RuntimeException("Fehler beim Speichern",e);
        }
    }

    public List<RowDataDto> loadData() {
        try {
            if (file.exists()) {
                return mapper.readValue(file,
                        mapper.getTypeFactory().constructCollectionType(List.class,
                                RowDataDto.class));
            }
            return List.of();
        } catch (Exception e) {
            throw new RuntimeException("Fehler beim Laden",e);
        }
    }

    public void deleteData(int rowId) {
        try {
            List<RowDataDto> existingRows = loadData();
            existingRows.removeIf(row -> row.getRowId() == rowId);
            mapper.writeValue(file, existingRows);
        } catch (Exception e) {
            throw new RuntimeException("Fehler beim Löschen", e);
        }

    }



}
