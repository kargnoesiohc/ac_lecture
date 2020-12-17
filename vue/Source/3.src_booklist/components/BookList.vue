<template>
  <div id="booklist">
    <h2>{{ msg }}</h2>
    <ul>
      <li>
        <img src="../assets/image/a.jpg">
        위험한 식탁
      </li>
      <li>
        <img src="../assets/image/b.jpg">
        공부의 비결
      </li>
      <li>
        <img src="../assets/image/c.jpg">
        오메트라
      </li>
      <li>
        <img src="../assets/image/d.jpg">
        행복한 여행
      </li>
      <li>
        <img src="../assets/image/e.jpg">
        해커스토익
      </li>
      <li>
        <img src="../assets/image/f.jpg">
        도로 안내서
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'book',
  props: {
    msg: String
  }
}
</script>

<style scoped>

</style>
