package com.fullcycle.admin.catalogo.domain.category;

public record CategorySearchQuery(
    int page,
    int perPage,
    String term,
    boolean active,
    String sort,
    String sortDirection
) {
}
