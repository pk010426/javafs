// document.addEventListener("DOMContentLoaded", function () {})
    // html 문서를 먼저 읽고 함수를 실행해라
    // 제이쿼리 표현 $(document).ready(function(){});



   

    // let time = new Date;


    setInterval(timer, 1000);
    function timer() {
        const yy = document.querySelector(".yy");
        const mm = document.querySelector(".mm");
        const dd = document.querySelector(".dd");
        const we = document.querySelector(".we");
        const hh = document.querySelector(".hh");
        const mi = document.querySelector(".mi");
        const ss = document.querySelector(".ss");
        let time = new Date;

        yy.innerHTML = time.getFullYear() + " 년";
        mm.innerHTML = time.getMonth() + 1 + " 월";
        dd.innerHTML = time.getDate() + " 일";
        // 요일 표시 함수
        function day() {
            let t = time.getDay();
            if (t == 0) {
                return "일";
            }
            else if (t == 1) {
                return "월";
            }
            else if (t == 2) {
                return "화";
            }
            else if (t == 3) {
                return "수";
            }
            else if (t == 4) {
                return "목";
            }
            else if (t == 5) {
                return "금";
            }
            else if (t == 6) {
                return "토";
            }
        }
        we.innerHTML = day() + "요일";
        hh.innerHTML = time.getHours() + " 시";
        mi.innerHTML = time.getMinutes() + " 분";
        ss.innerHTML = time.getSeconds() + " 초";
    }