<template>
  <div class="hello">
    <p>{{mesg}}</p>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data: function () {
    return {mesg: 'HelloWorld'};

  },
  beforeCreate() {
    console.log("child.beforeCreate()");
  },
  created() {
    console.log("child.created");
  },
  beforeMount() {
    console.log("child.beforeMount");
  },
  mounted() {
    console.log("child.mounted1", this.mesg);
    this.mesg = 'happy로 변경';
    console.log("child.mounted2", this.mesg);
  },
  beforeUpdate() {
    console.log("child.beforeUpdate()")
  },
  updated() {
    console.log("child.update()")
  },
  beforeDestroy() {
    console.log("child.beforeDestroy()")
  },
  destroyed() {
    console.log("child.destroyed")
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
