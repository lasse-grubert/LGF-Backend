package com.website.lgfbackend.controller;


import com.website.lgfbackend.dto.RowDataDto;
import com.website.lgfbackend.service.TableService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("time/table")
public class TableController {

    private final TableService tableService;

    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    @PostMapping
    public void saveTable(@RequestBody List<RowDataDto> rows) {
        tableService.saveData(rows);
    }

    @GetMapping
    public List<RowDataDto> getTable() {
        return tableService.loadData();
    }

    @DeleteMapping("/{rowId}")
    public void deleteRow(@PathVariable int rowId) {
        tableService.deleteData(rowId);
    }
}
