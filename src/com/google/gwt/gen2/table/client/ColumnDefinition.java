/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.gen2.table.client;

/**
 * A definition of a column in a table.
 * 
 * @param <RowType> the type of the row value
 * @param <ColType> the data type of the column
 */
public interface ColumnDefinition<RowType, ColType> {
  /**
   * Get the {@link CellEditor} that should be used to edit the contents of
   * cells in this column.
   * 
   * @return the associated {@link CellEditor}
   */
  CellEditor<ColType> getCellEditor();

  /**
   * Get the cell renderer associated with the column.
   * 
   * @return the associated {@link CellRenderer}, or null if one does not exist
   */
  CellRenderer<RowType, ColType> getCellRenderer();

  /**
   * Get the cell value associated with the row value.
   * 
   * @param rowValue the row value
   * @return the cell value for the given row value
   */
  ColType getCellValue(RowType rowValue);

  /**
   * Get the maximum width of the column. A return value of -1 indicates that
   * the column has no maximum width, but the consumer of the data may impose
   * one anyway.
   * 
   * @return the maximum allowable width of the column
   */
  int getMaximumColumnWidth();

  /**
   * Get the minimum width of the column. A return value of -1 indicates that
   * the column has no minimum width, but the consumer of the data may impose
   * one anyway.
   * 
   * @return the minimum allowable width of the column
   */
  int getMinimumColumnWidth();

  /**
   * Returns the preferred width of the column in pixels. Views should respect
   * the preferred column width and attempt to size the column to its preferred
   * width. If the column must be resized, the preferred width should serve as a
   * weight relative to the preferred widths of other ColumnDefinitions.
   * 
   * @return the preferred width of the column
   */
  int getPreferredColumnWidth();

  /**
   * Returns true if the column is sortable, false if it is not.
   * 
   * @return true if the column is sortable, false if it is not sortable
   */
  boolean isColumnSortable();

  /**
   * Set the value of this column in the row value.
   * 
   * @param rowValue the value of the row
   * @param cellValue the new value of the cell
   */
  void setCellValue(RowType rowValue, ColType cellValue);
}
