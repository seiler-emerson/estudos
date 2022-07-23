const SelectMenu = {
    home() {
        document.getElementById('link-home').setAttribute('class', 'nav-link active');
        document.getElementById('link-about').setAttribute('class', 'nav-link')
        document.getElementById('link-product').setAttribute('class', 'nav-link')
        document.getElementById('link-contact').setAttribute('class', 'nav-link')
    },
    about() {
        document.getElementById('link-about').setAttribute('class', 'nav-link active');
        document.getElementById('link-home').setAttribute('class', 'nav-link')
        document.getElementById('link-product').setAttribute('class', 'nav-link')
        document.getElementById('link-contact').setAttribute('class', 'nav-link')
    },
    product() {
        document.getElementById('link-product').setAttribute('class', 'nav-link active');
        document.getElementById('link-about').setAttribute('class', 'nav-link')
        document.getElementById('link-home').setAttribute('class', 'nav-link')
        document.getElementById('link-contact').setAttribute('class', 'nav-link')
    },
    contact() {
        document.getElementById('link-contact').setAttribute('class', 'nav-link active');
        document.getElementById('link-about').setAttribute('class', 'nav-link')
        document.getElementById('link-product').setAttribute('class', 'nav-link')
        document.getElementById('link-home').setAttribute('class', 'nav-link')
    },
}