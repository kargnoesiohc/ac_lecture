<template>
  <div class="hello">
    <h3>교재 정보</h3>
    <div v-for="(book, i) in bookList" v-bind:key="`book${i}`">
      <input type="checkbox" v-model="books" v-bind:value="book.name">{{book.name}}<span> {{book.price}}원</span><br>
      <button @click="del" data-i="i">삭제</button>
    </div>
    <hr>
    <button @click="allDel" data-i="i">선택 삭제</button>
    <hr>
    선택 목록 : {{books}}
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data:function(){
    return{
      bookList:[
        {name:'자바의 정석', price:2000},
        {name:'jsp 정석', price:3000},
        {name:'Spring의 정석', price:4000},
        {name:'jQuery의 정석', price:1000},
        {name:'Angular의 정석', price:5000},
      ],
      books:[],
    }
  },
  //이벤트 핸들러 등록
  methods: {
    del:function(e) {
      let i = e.target.dataset.i;
      this.bookList.splice(i,1);
      this.books = [];
    },
    allDel:function() {
      let list = this.bookList;
      this.books.map((ele) => {
        list.map((e, i) => {
          if(ele === e.name) {
            list.splice(i,1);
            this.books = [];
          }
        })
      })
    }

  },
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
