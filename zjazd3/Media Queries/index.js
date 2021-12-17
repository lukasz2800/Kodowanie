window.onload = screen;
window.onresize = screen;

function screen() {
  width = window.innerWidth;
  document.getElementById("size").innerHTML = "Szerokosc: " + width + "px";
}
