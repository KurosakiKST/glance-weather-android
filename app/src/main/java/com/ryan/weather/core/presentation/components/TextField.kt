package com.ryan.weather.core.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ryan.weather.home.presentation.model.CityUIModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    onSearch: () -> Unit,
    cities: List<CityUIModel>?,
    onCitySelected: (CityUIModel) -> Unit,
    onClearCityList: () -> Unit
) {
    val keyboardController = LocalSoftwareKeyboardController.current
    var isFocused by remember { mutableStateOf(false) }

    Column {
        TextField(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier
                .onFocusChanged {
                    isFocused = it.isFocused
                },
            placeholder = { Text("Search by City...", color = Color.Gray) },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon",
                    tint = Color.White
                )
            },
            shape = RoundedCornerShape(16.dp),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xFF293A67),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.Gray
            ),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(onSearch = {
                onSearch()
                onClearCityList()
                keyboardController?.hide()
            })
        )

        cities?.let { cityList ->
            if (isFocused) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .padding(8.dp)
                ) {
                    cityList.forEach { city ->
                        TextBody2(
                            text = city.name,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    onCitySelected(city)
                                }
                                .padding(8.dp),
                            color = Color.Black
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SearchTextFieldPreview() {
    var searchText by remember { mutableStateOf("") }
    SearchTextField(
        value = searchText,
        onValueChange = { searchText = it },
        cities = listOf(
            CityUIModel(
                id = 1,
                name = "City 1",
                region = "Region 1",
                country = "Country 1",
                latitude = 1.0,
                longitude = 2.0,
                url = "url1"
            ),
            CityUIModel(
                id = 1,
                name = "City 1",
                region = "Region 1",
                country = "Country 1",
                latitude = 1.0,
                longitude = 2.0,
                url = "url1"
            )
        ),
        onSearch = {},
        onCitySelected = {},
        onClearCityList = {}
    )
}