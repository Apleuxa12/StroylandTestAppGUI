package com.ddmukhin.stroylandtestappgui

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainPage() {
    LazyColumn {
        item {
            Header()
        }
        item {
            Spacer(Modifier.size(8.dp))
        }
        item {
            Buttons()
        }
        item {
            Spacer(Modifier.size(19.dp))
        }
        item {
            Info()
        }
        item {
            WidgetDivider()
        }
        item {
            Details()
        }
        item {
            WidgetDivider(end = 14.dp)
        }
        item {
            FriendsListHeader()
        }
        item {
            Spacer(Modifier.size(1.dp))
        }
        item {
            FriendsList()
        }
        item {
            WidgetDivider(end = 4.dp)
        }
        item {
            PhotosGridHeader()
        }
        item {
            Spacer(Modifier.size(1.dp))
        }
        item {
            PhotosGrid()
        }
        item {
            Spacer(Modifier.size(6.dp))
            Spacer(
                Modifier
                    .fillMaxWidth()
                    .height(12.dp)
                    .background(Colors.GRAY)
            )
        }
        item {
            Spacer(
                Modifier
                    .size(8.dp)
                    .background(Color.White)
            )
            BarButtons()
            Spacer(
                Modifier
                    .size(8.dp)
                    .background(Color.White)
            )
        }
    }
}

@Composable
fun BarButtons() {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Spacer(Modifier.weight(1f))
        RoundedButton(
            text = "Создать запись", colors = ButtonDefaults.buttonColors(
                backgroundColor = Colors.LIGHT_GRAY,
                contentColor = Colors.BLUE
            ),
            modifier = Modifier.weight(20f)
        )
        Spacer(Modifier.weight(3f))
        Image(
            painter = painterResource(R.drawable.ic_picture),
            contentDescription = "picture",
            modifier = Modifier.weight(3f)
        )
        Spacer(Modifier.weight(3f))
        Image(
            painter = painterResource(R.drawable.ic_lamp),
            contentDescription = "lamp",
            modifier = Modifier.weight(3f)
        )
        Spacer(Modifier.weight(3f))
    }
}

@Composable
fun Details() {
    Column(
        verticalArrangement = Arrangement.spacedBy(5.dp),
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.padding(start = 16.dp)
    ) {
        DetailedWidget(
            painter = painterResource(R.drawable.ic_home),
            description = "home",
            text = "Город: Москва",
            color = Colors.GRAY
        )
        DetailedWidget(
            painter = painterResource(R.drawable.ic_education),
            description = "education",
            text = "Образование: НИУ ВШЭ (ГУ-ВШЭ)",
            color = Colors.GRAY
        )
        DetailedWidget(
            painter = painterResource(R.drawable.ic_subs),
            description = "subs",
            text = "104 подписчика",
            color = Colors.GRAY
        )
        Spacer(Modifier.size(4.dp))
        DetailedWidget(
            painter = painterResource(R.drawable.ic_details),
            description = "details",
            text = "Подробная информация",
            color = Colors.BLUE
        )
    }
}

@Composable
fun Info() {
    Row(
        horizontalArrangement = Arrangement.Start
    ) {
        UnderWidget(
            painter = painterResource(R.drawable.ic_in_friends),
            description = "in friends",
            text = "В друзьях"
        )
        UnderWidget(
            painter = painterResource(R.drawable.ic_money),
            description = "money",
            text = "Деньги"
        )
        UnderWidget(
            painter = painterResource(R.drawable.ic_gift),
            description = "money",
            text = "Подарок"
        )
        UnderWidget(
            painter = painterResource(R.drawable.ic_notification),
            description = "money",
            text = "Уведомления",
        )
    }
}

@Composable
fun Buttons() {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(Modifier.weight(1.5f)) {
            Spacer(Modifier.fillMaxWidth())
        }
        Column(Modifier.weight(20f)) {
            RoundedButton(
                text = "Сообщение", colors = ButtonDefaults.buttonColors(
                    backgroundColor = Colors.BLUE,
                    contentColor = Color.White
                )
            )
        }
        Column(Modifier.weight(1f)) {
            Spacer(Modifier.fillMaxWidth())
        }
        Column(Modifier.weight(20f)) {
            RoundedButton(
                text = "Звонок", colors = ButtonDefaults.buttonColors(
                    backgroundColor = Colors.BLUE,
                    contentColor = Color.White
                )
            )
        }
        Column(Modifier.weight(1.5f)) {
            Spacer(Modifier.fillMaxWidth())
        }
    }
}

@Composable
fun Header() {
    Spacer(Modifier.size(12.dp))
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(R.drawable.avatar),
            contentDescription = "avatar",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Spacer(Modifier.size(12.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(2.dp)
        ) {
            Text(
                text = "Дмитрий Мухин",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Colors.BLACK
            )
            Text(
                text = "Keep calm and make UI",
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                color = Colors.BLACK
            )
            Text(
                text = "online",
                fontSize = 14.sp,
                fontWeight = FontWeight.W500,
                color = Colors.GRAY
            )
        }
    }
}

@Composable
fun PhotosGridHeader() {
    Row(
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier.padding(start = 16.dp)
    ) {
        Text(
            text = "ФОТОГРАФИИ",
            fontSize = 15.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Colors.BLACK
        )
        Spacer(Modifier.size(6.dp))
        Text(
            text = "6",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Colors.GRAY
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PhotosGrid() {
    val photos = listOf(
        painterResource(R.drawable.avatar),
        painterResource(R.drawable.avatar),
        painterResource(R.drawable.avatar),
        painterResource(R.drawable.avatar),
        painterResource(R.drawable.avatar),
        painterResource(R.drawable.avatar)
    )
    var cur = 0
    val rowSize = 3
    val rowsNumber = photos.size / rowSize + if (photos.size % rowSize == 0) 0 else 1
    repeat(rowsNumber) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(1.dp),
            modifier = Modifier.height(120.dp)
        ) {
            repeat(rowSize) {
                Image(
                    painter = photos[it + cur * rowSize], contentScale = ContentScale.Crop,
                    modifier = Modifier.weight(1f),
                    contentDescription = "photo 1"
                )
            }
            cur++
        }
        Spacer(Modifier.size(1.dp))
    }
}

@Composable
fun FriendsListHeader() {
    Row(
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier.padding(start = 16.dp)
    ) {
        Text(
            text = "ДРУЗЬЯ",
            fontSize = 15.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Colors.BLACK
        )
        Spacer(Modifier.size(6.dp))
        Text(
            text = "169",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Colors.GRAY
        )
    }
}

@Composable
fun FriendsList() {
    val friends = listOf(
        "Стив Джобс",
        "Билл Гейтс",
        "Джефф Безос",
        "Илон Маск",
        "Ларри Пейдж",
        "Сергей Брин"
    )
    LazyRow {
//        Initial offset
        item {
            Spacer(Modifier.size(16.dp))
        }
        items(friends) { item ->
            FriendWidget(name = item)
        }
    }
}

@Composable
fun FriendWidget(
    name: String,
    painter: Painter = painterResource(R.drawable.avatar),
    description: String = name
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(1.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.width(80.dp)
    ) {
        Image(
            painter = painter,
            contentDescription = description,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(60.dp)
        )
        Text(
            text = name,
            fontWeight = FontWeight.SemiBold,
            color = Colors.BLACK,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun DetailedWidget(
    painter: Painter,
    description: String,
    text: String,
    fontSize: TextUnit = 15.sp,
    color: Color
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(painter = painter, contentDescription = description)
        Text(
            text = text,
            fontSize = fontSize,
            fontWeight = FontWeight.SemiBold,
            color = color
        )
    }
}

@Composable
fun WidgetDivider(start: Dp = 8.dp, end: Dp = 8.dp) {
    Spacer(Modifier.height(8.dp))
    Divider(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp)
    )
    Spacer(Modifier.height(8.dp))
}

@Composable
fun UnderWidget(
    modifier: Modifier = Modifier,
    painter: Painter,
    description: String,
    text: String,
    fontSize: TextUnit = 13.sp
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(6.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(start = 19.dp, end = 19.dp)
    ) {
        Image(painter = painter, contentDescription = description, modifier = Modifier.scale(1.4f))
        Text(
            text = text,
            fontSize = fontSize,
            fontWeight = FontWeight.W500,
            color = Colors.LIGHT_BLUE
        )
    }
}

@Composable
fun RoundedButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    text: String,
    colors: ButtonColors,
    style: TextStyle = LocalTextStyle.current
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(8.dp),
        modifier = modifier.fillMaxWidth(),
        colors = colors
    ) {
        Text(text = text, fontWeight = FontWeight.Bold, style = style)
    }
}