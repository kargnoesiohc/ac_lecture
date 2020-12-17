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
    console.log("beforeCreate()", this);
    console.log(this.mesg);
  },
  created() {
    console.log("created");
    console.log(this.mesg);
  },
  beforeMount() {
    console.log("beforeMount");
    console.log(this.mesg);
  },
  mounted() {
    console.log("mounted1", this.mesg);
    this.mesg = 'happy로 변경';
    console.log("mounted2", this.mesg);
  },
  beforeUpdate() {
    console.log("beforeUpdate()")
    console.log(this.mesg);
  },
  updated() {
    console.log("update()")
    console.log(this.mesg);
  },
  beforeDestroy() {
    console.log("beforeDestroy()")
    console.log(this.mesg);
  },
  destroyed() {
    console.log("destroyed")
    console.log(this.mesg);
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
