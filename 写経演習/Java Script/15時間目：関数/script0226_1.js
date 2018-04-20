function totalPrice(price,tax=1.08,haiso=400){
    return(price+haiso)*tax;
}

document.write(totalPrice(300)+"<br>");
document.write(totalPrice(450)+"<br>");