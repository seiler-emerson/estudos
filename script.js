
// ================================================ //
// ================== MENU MOBILE ================= //
// ================================================ //

let iconMenuCompact = document.querySelector('.menu-compact');
let menuOpen = document.querySelector('.menu-complete');

function openMenuCompact() {
    iconMenuCompact.style.display = "none";
    menuOpen.style.display = "flex";
}

function closeMenuCompact() {
    var widthDisplay = window.screen.width;
    
    if(widthDisplay<600) {
        iconMenuCompact.style.display = "flex";
        menuOpen.style.display = "none";
    }
}


// ================================================ //
// ================ SLIDER PROJECTS =============== //
// ================================================ //

let totalProjects = document.querySelectorAll('.box').length;
document.querySelector('.projects').style.width = `calc(340px * ${totalProjects})`;

let currentProject = 0;

function goPrev() {
    currentProject--;
    if (currentProject<0) {
        currentProject = totalProjects - 3;
    } 
    updateMargin();
}

function goNext() {
    currentProject++;
    if (currentProject>(totalProjects - 3)) {
        currentProject = 0;
    }
    updateMargin();
}


//480px
function updateMargin() {
    let newMargin = 0;
    let actualWidthDisplay = window.screen.width;
    if(actualWidthDisplay <= 480) {
        newMargin = (currentProject * 310);
    } else {
        newMargin = (currentProject * 340);
    }
    document.querySelector('.projects').style.marginLeft = `-${newMargin}px`;
    console.log("cliquei")
}

setInterval(goNext, 4000)