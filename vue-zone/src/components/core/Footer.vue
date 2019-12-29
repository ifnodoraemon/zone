<template>
    <v-footer
        class="py-4"
        dark
        height="auto"
    >
        <v-container
                mx-auto
        >
            <v-layout wrap>
                <v-flex xs12>
                    <v-row
                            class="fill-height"
                            align="center"
                            justify="center"
                    >
                        since @2019 - {{new Date().getFullYear()}}  如果大雄没有机器猫
                    </v-row>
                </v-flex>
            </v-layout>

        </v-container>
    </v-footer>
</template>

<script>
    export default {
        name: "Footer"
    }
</script>

<style scoped>
</style>
