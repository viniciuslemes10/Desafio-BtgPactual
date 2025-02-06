package com.vinidev.btgpactual.controller.dto;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public record ApiResponse<T>(Map<String, Objects> summary,
                             List<T> data,
                             PaginationResponse pagination) {
}
