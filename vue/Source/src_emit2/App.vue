<template>
  <div id="app">
    <h3>도서 목록{{list.length}}권</h3>
    선택한 도서 목록<input type="text" v-bind:value="bookName">
    <BookList v-bind:bookList="list" v-on:xyz="y"/>
  </div>
</template>

<script>
import BookList from './components/BookList.vue'

export default {
  name: 'App',
  components: {
    BookList,
  },
  data: function() {
    return {
      list: [
        {
          id: "p01",
          name: "위험한 식탁",
          price: 2000,
          date: "20170401",
          img: "a",
        },
        {
          id: "p02",
          name: "공부의 비결",
          price: 3000,
          date: "20170402",
          img: "b",
        },
        {
          id: "p03",
          name: "오메르타",
          price: 2500,
          date: "20170401",
          img: "c",
        },
        {
          id: "p04",
          name: "행복한 여행",
          price: 4000,
          date: "20170401",
          img: "d",
        },
        {
          id: "p05",
          name: "해커스 토익",
          price: 2000,
          date: "20170401",
          img: "e",
        },
        {
          id: "p06",
          name: "도로 안내서",
          price: 2000,
          date: "20170401",
          img: "f",
        },
      ],
      bookName: "", //선택한 책 제목
    };
  },

  methods: {
    y:function (xxx) {
      this.bookName = xxx;
    },
  },
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
