
window.onload=function(){

    function updateBoard(direct) {
        var $gridVals = [];
    
        $('.grid-item').each(function( index ) {
            //console.log( index + ": " + $( this ).text() );
            $gridVals.push($( this ).text());
          });
    
          var $respVals = JSON.stringify({direction: direct, values: $gridVals});
          //console.log($respVals);
    
        // send AJAX POST request
        var $urlString = "/"
        $.ajax({
            url: $urlString,
            type: 'POST',
            dataType : "json",
            contentType: "application/json",
            data: $respVals,
            success: function(response) {
                //console.log("in success")
                console.log(JSON.stringify(response));
                $('.grid-item').each(function(index){
                    //console.log(response[index])
                    $( this ).text(response[index]);
                });
    
            },
            error: function(error){
                console.log(error);
 
            }
        });
        }
        $('#slideRight').on('click', function(){
            console.log('right clicked')
            updateBoard("right");
        })
        $('#slideUp').on('click', function(){
            console.log('Up clicked')
            updateBoard("up");
        })
        $('#slideDown').on('click', function(){
            console.log('Up clicked')
            updateBoard("down");
        })
        $('#slideLeft').on('click', function(){
            console.log('Up clicked')
            updateBoard("left");
        })

    }