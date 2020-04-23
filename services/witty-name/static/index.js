window.onload=function(){

    $("#indexIcon").hover(
        function() { $(this).addClass("Hover"); },
        function() { $(this).removeClass("Hover"); }
    );
    
    $( "#ballHolder" ).click(function() {

        $(this).fadeOut( 400, function() {
            $( "#formHolder" ).fadeIn( 400 );
            });
        
        setTimeout(function(){
            $("#eight").text('42');
        }, 300);
        
        return false;
    });
    
    $(document).mouseup(function(e) {
        var container = $("#formHolder");

    // if the target of the click isn't the container nor a descendant of the container
//        if (!container.is(e.target) && container.has(e.target).length === 0) {
//            
//            container.fadeOut(300, function() {
//                $("#ballHolder").fadeIn(300);
//            });
//            return false;
////            container.hide();
////            console.log("in if");
//        };
    });
    
    // AJAX when question is submitted
    $("#submit").click(function() {
        var query = '/question';
        //var quest = $('#question').val();
        //console.log('weust: ', quest);
        $.ajax({
            method: 'GET',
            url: query,
            data: {
                question: $('#question').val()
            },
        }).done(function(response) {
            //console.log("response: ", response.response);
            $("#eight").text(response.response);
            
            $("#formHolder").fadeOut( 400, function() {
            $( "#ballHolder" ).fadeIn( 400 );
            });
            
            })
        .fail(function(xhr, status, error){
            console.log("error occured during elevation ajax: ", xhr.status);
        })
        
        setTimeout(function(){
            $("#question").val('');
        }, 400);

    });
};
