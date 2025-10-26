package com.fullcycle.admin.catalogo.domain.pagination;

import java.util.List;

public record Pagination<T>(
    int currentPage,
    int perPage,
    int totalPages,
    long totalElements,
    List<T> items
) {
}
