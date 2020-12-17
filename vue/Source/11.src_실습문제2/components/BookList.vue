<template>
  <div id="booklist">
    <h2>도서목록 {{list.length}}권</h2>
    <ul>
<!--      <li v-for="book in list" v-bind:key="book.name">&lt;!&ndash;v-bind: key = "유일값"&ndash;&gt;-->
      <li v-for="(book, index) in list" v-bind:key="index">
        <a href="#">
          <img v-bind:src="require(`@/assets/image/${book.img}.jpg`)">{{book.name}}
        </a>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "BookList",
  props: {
    list: Array
  }
}
</script>

<style scoped>

</style>
