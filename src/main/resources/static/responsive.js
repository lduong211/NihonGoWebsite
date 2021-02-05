function myFunction() {
    var x = document.getElementById("myTopnav");
    if (x.className === "topnav") {
        x.className += " responsive";
    } else {
        x.className = "topnav";
    }
}

function myFunction2() {
    var x = document.getElementById("myBottomnav");
    var a = document.getElementById("btnclose");
    // var i = document.getElementById("iconclose");
    if (x.className === "bottomnav") {
        a.innerText = "Close";
        x.className += " responsive";
    } else {
        a.innerText = "Category";
        x.className = "bottomnav";
    }
}