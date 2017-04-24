/**
 * Created by Richard on 23/04/2017.
 */

function btn(el) {

    const circle1 = new mojs.Shape({
        fill: 'rgba(0,0,0,.2)',
        radius: 100,
        scale: {0: 1},
        angle: {'rand(-35, -70)': 0},
        duration: 1000,
        left: 0, top: 0,
        parent: el,
        easing: 'cubic.out',
        opacity: {1: 0}
    });

    $(el).on('click', function (e) {

        var offset = $(this).offset();
        circle1
            .tune({x: e.pageX - offset.left, y: e.pageY - offset.top})
            .replay()

    });

}

$(function(){
    $('.Btn').each(function(){btn(this);});
})

