//var images =
//['https://template55632.motopreview.com/mt-demo/55600/55632/mt-content/uploads/2015/10/mt-0169-home-slider1.jpg',
//'https://template55632.motopreview.com/mt-demo/55600/55632/mt-content/uploads/2015/10/mt-0169-home-slider2.jpg',
//'https://template55632.motopreview.com/mt-demo/55600/55632/mt-content/uploads/2015/10/mt-0169-home-slider3.jpg'];

// array of images
var slides = [
  { src: "/images/beauty.jpg" },
  { src: "/images/yoga2.jpg" },
  { src: "/images/healing.jpg" },
  {
    video: {
      src: ["/images/budha.mp4"],
      loop: true,
      mute: true,
    },
  },
];

$(".slider").vegas({
  shuffle: true,
  cover: true,
  trasition: "fade",
  slides: slides,
  overlay: "images/07.png",
});

//Slider Image size :-
//2050 x 964
//1280 x 853
