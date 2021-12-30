let totalSlides = document.querySelectorAll('.slider--item').length;
let currentSlide = 0;  //O slide que é exibido inicialmente

document.querySelector('.slider--width').style.width = `calc(100vw * ${totalSlides})`;
document.querySelector('.slider--controls').style.height = `${document.querySelector('.slider').clientHeight}px`;

function goPrev() {
    currentSlide--;  //Diminui um slide
    if(currentSlide < 0) {  //Se o slide for o primento, ao clicar ele ira para o ultimo.
        currentSlide = totalSlides - 1;
    }
    updateMargin();
}

function goNext() {
    currentSlide++;
    if(currentSlide > (totalSlides - 1) ) {  //Se o slide for o primento, ao clicar ele ira para o ultimo.
        currentSlide = 0;
    }
    updateMargin();
}

function updateMargin() {
    let sliderItemWidth = document.querySelector('.slider--item').clientWidth;
    let newMargin = (currentSlide * sliderItemWidth)
    document.querySelector('.slider--width').style.marginLeft = `-${newMargin}px`;
}

setInterval(goNext, 5000);