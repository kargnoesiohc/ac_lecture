<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    1) v-text: <span v-text="x"></span><br>
    2) v-html: <span v-html="y">{{y}}</span>
    <p v-html="y"></p>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data: function() {
    return {
      x:'홍길동',
      y:'<h1>홍길동</h1>'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
