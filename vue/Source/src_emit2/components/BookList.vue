<template>
  <div class="hello">
   <ul>
     <li v-for="(book, i) in bookList" v-bind:key="i">
       <a v-on:click="x">
         <img v-bind:src="require(`../assets/image/${book.img}.jpg`)"
           width="100" height="100" v-bind:data-xxx="book.name">
         {{book.name}}
       </a>
     </li>
   </ul>

  </div>
</template>

<script>
export default {
  name: 'BookList',
  props: {
    bookList: Array, //수정
  },
  data:function(){
    return{

    }
  },
  //이벤트 핸들러 등록
  methods: {
    x:function(e) {
      this.$emit("xyz", e.target.dataset.xxx);//자식에서 부모로 전달 될 이벤트 명
    },
  },
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
