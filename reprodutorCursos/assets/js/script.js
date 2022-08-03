$("#module-list-1").on("click", function() {
    if( $("li:hidden" ).length ){
        $("li").show()
    } else {
        $("li").hide()
    }
})

$("#test-1").on("click", function() {
    $("<iframe>",{src:"./assets/videos/001.mp4", frameborder: `0`}).appendTo("embed-container")
})