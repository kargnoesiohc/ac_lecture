<template>
  <div class="hello">
    <h3>교재 정보</h3>
    <div v-for="(book, i) in bookList" v-bind:key="`book${i}`">
      <input type="checkbox" v-model="books" v-bind:value="book">{{book.name}}<span> {{book.price}}원</span><br>
    </div>
    <hr>
    <h3>선택 교재</h3>
    <div v-for="(book, i) in books" v-bind:key="`checkBook${i}`">{{book.name}}</div>
    <hr>
    <b>총합 : {{total}}원</b> <!--watch 사용-->
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  watch: {
    books:function () { //반응형 콜백, 반드시 변수명과 메소드명을 일치시켜야 함, Vue 인스턴스의 특정 프로퍼티가 변경될 때 지정한 콜백함수가 실행 됨(지정한 대상의 값이 변경될 때마다 정의한 함수 실행)
      console.log("watch 호출");
      let totalPrice = 0;
      let checkBooks = this.books; //선택한 책 목록
      //map : 배열 내의 모든 요소 각각에 대하여 주어진 함수를 호출한 결과를 모아 새로운 배열 반환
      checkBooks.map((ele, idx) => { //콜백 함수, ele = {name: 책 제목, price:가격}, idx=인덱스
        console.log(idx, ele.name, ele.price);
        totalPrice += ele.price; //totalPrice 변수에 선택한 책의 가격 저장
      });
      this.total = totalPrice; //this.total set
    }
  },
  data: function(){
    return {
      bookList:[
        {name:'자바의 정석', price:30000},
        {name:'jsp 정석', price:40000},
        {name:'Spring 정석', price:50000},
        {name:'jQuery 정석', price:60000},
        {name:'Angluar 정석', price:70000},
      ],
      books:[], //선택한 책 저장
      total:0, //총 가격 저장
    }
  },
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
