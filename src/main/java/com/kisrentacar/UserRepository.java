package com.kisrentacar;

import io.micronaut.core.annotation.NonNull;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface UserRepository {
    @NonNull
    Publisher<User> list();

    Mono<Boolean> save(@NonNull @NotNull @Valid User fruit);
}
