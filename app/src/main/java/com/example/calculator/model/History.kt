package com.example.calculator.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


//data class 및 @Entity
@Entity
data class History (@PrimaryKey val uid: Int?,
                    @ColumnInfo(name = "expression") val expression: String?,
                    @ColumnInfo(name = "result") val result: String?) {

}