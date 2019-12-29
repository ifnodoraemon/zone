<template>
    <v-container
            id="subscribe"
            tag="section"
    >
        <v-card
                color="rgba(203, 170, 92, 0.51)"
                class="pa-3"
        >
            <v-container
                    grid-list-xl
                    pa-0
            >
                <v-layout wrap>
                    <v-flex
                            xs12
                            md5
                    >
                        <v-subheader class="mb-3">
                            Subscribe
                        </v-subheader>
                        <p>
                            Enter your email address to subscribe to this blog
                            and receive notifications of new posts by email.
                        </p>

                        <v-layout
                                wrap
                                pa-2
                        >
                            <v-text-field
                                    solo
                                    hide-details
                                    style="max-width: 400px;"
                            />
                            <v-btn
                                    :block="$vuetify.breakpoint.xsOnly"
                                    class="ma-0"
                                    color="secondary"
                                    style="height: 48px"
                            >
                                Subscribe
                            </v-btn>
                        </v-layout>
                    </v-flex>
                    <v-flex
                            xs12
                            md6
                            offset-md1
                    >
                        <v-subheader>Contact</v-subheader>
                        <v-list class="transparent">
                            <v-list-item>
                                <v-list-item-avatar
                                        color="primary"
                                >
                                    <v-icon
                                            class="elevation-4"
                                            dark
                                    >
                                        mdi-email-outline
                                    </v-icon>
                                </v-list-item-avatar>
                                <v-list-item-title>EMAIL</v-list-item-title>
                                <v-list-item-subtitle>
                                    THEARTOFTRAVEL@GMAIL.COM
                                </v-list-item-subtitle>
                            </v-list-item>
                            <v-list-item>
                                <v-list-item-avatar
                                        color="primary"
                                >
                                    <v-icon
                                            class="elevation-4"
                                            dark
                                    >
                                        mdi-map-marker
                                    </v-icon>
                                </v-list-item-avatar>
                                <v-list-item-title>ADDRESS</v-list-item-title>
                                <v-list-item-subtitle>
                                    1234 WORLD DR. HERE, TX 76123
                                </v-list-item-subtitle>
                            </v-list-item>
                            <v-list-item>
                                <v-list-item-avatar
                                        color="primary"
                                >
                                    <v-icon
                                            class="elevation-4"
                                            dark
                                    >
                                        mdi-phone
                                    </v-icon>
                                </v-list-item-avatar>
                                <v-list-item-title>PHONE</v-list-item-title>
                                <v-list-item-subtitle>
                                    555-789-1234
                                </v-list-item-subtitle>
                            </v-list-item>
                        </v-list>
                    </v-flex>
                </v-layout>
            </v-container>
        </v-card>
    </v-container>
</template>

<script>
    export default {
        name: "Subscribe"
    }
</script>

<style scoped>

</style>
