package io.delta.core.internal.actions;

import io.delta.core.data.Row;
import io.delta.core.types.StructType;

public class Metadata implements Action {

    public static Metadata fromRow(Row row) {
        if (row == null) return null;

        return new Metadata();
    }

    public static final StructType READ_SCHEMA = new StructType();

    public StructType getSchema() {
        return null;
    }
}